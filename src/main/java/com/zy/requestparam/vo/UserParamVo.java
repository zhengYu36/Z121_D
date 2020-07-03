package com.zy.requestparam.vo;

import com.zy.entity.User;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotBlank;

/**
 * <ul>
 * <li>文件包名 : com.zy.requestparam.vo</li>
 * <li>创建时间 : 2019/10/25 14:19</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：查询user实体的参数集合
 *
 * @author zhengyu
 */
@Data
public class UserParamVo extends User {

    @NotBlank(message = "name不能为空111")
    private String name;

    @Email(message = "必须是邮箱格式")
    @NotBlank(message = "邮箱不能为空")
    //注意这里,@Email 这个字段是可以为空的,只是说如果不为空,那么必须是邮箱格式
    private String mail;

    public UserParamVo() {
        super("张三", 11);
    }
}
