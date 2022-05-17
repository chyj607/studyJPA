package jpabook.start;

import javax.persistence.*;  //**

/**
* @Class        : Member
* @author       : ChoiYunJeong
* @date         : 2022-05-16
* @Description  : 객체 매핑 시작
 * @Entity      : 이 클래스를 테이블과 매핑한다고 JPA에게 알려준다. 해당 어노테이션 사용으로 이 클래스는 엔티티 클래스이다.
 * @Table       : 엔티티 클래스에 매핑할 테이블 정보를 알려준다. 여기서는 name 속성을 사용해서 Member 엔티티를 MEMBER 테이블에 매핑했다.
 *                이 어노테이션을 생략하면 클래스 이름을 테이블 이름으로 매핑한다.(더 정확히는 엔티티 이름을 사용한다. 엔티티 이름은 후에 설명함.)
 * @Id          : 엔티티 클래스의 필드를 테이블의 기본 키에 매핑한다. 여기서는 엔티티의 id 필드를 테이블의 ID 기본 키 컬럼에 매핑 했다. 이렇게 @Id가 사용된 필드를 식별자 필드라 한다.
 * @Column      : 필드를 컬럼에 매핑한다. 여기서는 name 속성을 사용해서 Member 엔티티의 username 필드를 MEMBER 테이블의 NAME 컬럼에 매핑했다.
 * 매핑정보가 없는 필드  : age 필드에는 매핑 어노테이션이 없다. 이렇게 매핑 어노테이션을 생략하면 필드명을 사용해서 컬럼명으로 매핑한다. 여기선 필드명이 age이므로 age 컬럼으로 매핑했다.
 *                    참고로 데이터베이스가 대소문자를 구분하지 않는다는 가정 아래 설명한다. 만약 대소문자를 구분하는 데이터베이터를 사용하면 @Column(name = “NAME”) 처럼 명시적으로 매핑해야 함!
**/
@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column(name = "ID")
    private String id;          // 아이디

    @Column(name = "NAME")
    private String username;    // 이름

    // 매핑 정보가 없는 필드
    private Integer age;        // 나이

    //Getter, Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
