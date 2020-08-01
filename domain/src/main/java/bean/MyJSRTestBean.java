package bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.Map;

@Data
public class MyJSRTestBean {
    @Null(message="nullCheck验证对象应为空")
    @ApiModelProperty(value = "对象为空检查",required = true,example = "null")
    private Integer nullCheck;
    @ApiModelProperty(value = "对象为非空检查",required = true,example = "null")
    @NotNull(message = "nullNullCheck验证对象应为非空")
    private Integer nullNullCheck;
    @ApiModelProperty(value = "对象为true检查",required = true,example = "true")
    @AssertTrue(message = "assertTrueCheck对象应为true")
    private Boolean assertTrueCheck;
    @AssertFalse(message = "对象应为false")
    @ApiModelProperty(value = "assertFalseCheck对象为false检查",required = true,example = "false")
    private Boolean assertFalseCheck;
    @Range(min=1, max=5,message="数字应该在1-5范围之内")
    @ApiModelProperty(value = "rangeNumberCheck数字在1-5范围之内检查",required = true,example = "1")
    private Integer rangeNumberCheck;
    @Range(min=1, max=5,message="字符串应在1-5范围之内")
    @ApiModelProperty(value = "rangeStringCheck字符串在1-5范围之内检查",required = true,example = "1")
    private String rangeStringCheck;
    @Size(min = 1,max = 4,message = "数组对象长度应在1-4直接")
    @ApiModelProperty(value = "arraySizeSizeCheck数组对象长度在1-4范围之内检查",required = true,dataType = "Array" )
    private Integer[] arraySizeSizeCheck;
    @Size(min = 1,max = 2,message = "集合对象长度在1-2直接")
    @ApiModelProperty(value = "collectionSizeSizeCheck集合对象长度在1-4范围之内检查",required = true,dataType = "Map")
    private Map<String,Object> collectionSizeSizeCheck;
    @ApiModelProperty(value = "数组对象长度在1-4范围之内检查",required = true,dataType = "Date")
    @Past(message = "pastDateCheck应是过去的时间")
    private Date pastDateCheck;
    @ApiModelProperty(value = "验证是未来的时间",required = true,dataType = "Date")
    @Future(message = "futureDateCheck应为未来的时间")
    private Date futureDateCheck;
    @Pattern(regexp = "^[a-zA-Z0-9_]{6,32}$",message = "正则表达式检查，6-32位字符")
    @ApiModelProperty(value = "正则表达式检查，6-32位字符",required = true,example = "12345678")
    private String patternCheck;
    @Email(message = "应为邮箱格式")
    @ApiModelProperty(value = "邮箱检查",required = true,example = "12345678")
    private String email;


}
