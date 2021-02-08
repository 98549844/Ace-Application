package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(strategy = "identity", name = "id")
    @Column
    private Integer id;
    @Column
    private String password;


    //personal info
    @Column
    private String userName;
    @Column
    private String status;
    @Column
    private String email;
    @Column
    private String mobile;

    @Column
    private String domain;
    @Column
    private String ip;
    @Column
    private String hostName;

    @Column
    private String createUser;
    //注册日子
    @Column
    private LocalDateTime createDate;
    @Column
    private String amendUser;
    @Column
    private LocalDateTime amendDate;
    @Column
    private String remark;

}
