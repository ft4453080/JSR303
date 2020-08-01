package bean;

import annotation.ListValue;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.internal.engine.groups.Group;
import validGroups.Groups;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
@Data
public class MyJSRAdvancedTest {
    @Null(message = "新增不需要指定ID",groups = Groups.Add.class)
    @NotNull(message = "更新需要指定ID",groups = Groups.Update.class)
    @ApiModelProperty(value = "JSR313进阶：分组，新增场景不需要ID，更新场景需要ID",example = "1")
    private Integer id;
    @ListValue(message = "性别应指定相应的值",vals = {1,2},groups = {Groups.Add.class,Groups.Update.class})
    @ApiModelProperty(value = "JSR313进阶：自定义注解 男女选项 指定为1,2",example = "1")
    private Integer gender;
}
