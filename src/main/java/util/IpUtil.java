package util;

//import org.springframework.boot.web.context.WebServerInitializedEvent;
//import org.springframework.context.ApplicationListener;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

//@Component("自定义beanName")
public class IpUtil/* implements ApplicationListener<WebServerInitializedEvent>*/ {
    public static int Port;
    public static String ip;
    public static String hostName;
    public static String domain;


    public static void main(String[] args) {
        IpUtil ip = new IpUtil();
        Map m = ip.getClientHostInfo();
        MapUtil mapUtil = new MapUtil();
        mapUtil.iterateMapKeyset(m);

    }

    public static String getHostName() {
        IpUtil u = new IpUtil();
        Map m = u.getClientHostInfo();
        hostName = (String) m.get("hostName");
        return hostName;
    }


    public Map getClientHostInfo() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        this.ip = address.getHostAddress();
        this.hostName = address.getHostName();
        this.domain = address.getHostName();

        Map m = new HashMap();

        m.put("ip", ip);
        m.put("port", Port);
        m.put("hostName", hostName);
        m.put("domain", domain);

        return m;
    }


    //  @Override
    //public void onApplicationEvent(WebServerInitializedEvent event) {
    //  this.Port = event.getWebServer().getPort();
    //}

}