#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import lombok.Getter;
#parse("File Header.java")
@Getter
public enum ${NAME} {

    SUCCESS(200, "成功");
    
    private int code;
    private String desc;
    
   ${NAME}(int code,String desc) {
        this.code = code;
        this.desc = desc;
    }
    
}
