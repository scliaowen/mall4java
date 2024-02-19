package com.mall;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
/** 
 * @Desc：
 * @Author：415156969@qq.com 
 * @Date：2024-02-19 22:51:40 
 */
@Entity
@Table ( name ="t_test" )
@Getter
@Setter
public class Test  implements Serializable {

	private static final long serialVersionUID =  5184423181192975492L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "account" )
	private String account;
}
