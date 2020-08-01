package annotation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {
    private Set<Integer> set = new HashSet<Integer>();
    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        for(int val:vals){
            set.add(val);
        }
    }

    /**
     * 判断校验是否成功
     *
     * @param value
     * @param constraintValidatorContext
     * @return
     */
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return  set.contains(value);
    }
}
