import java.time.ZonedDateTime;

/**
 * @program: cloud2022
 * @description: 获取时间
 * @Packagename: PACKAGE_NAME
 * @ClassName: ZonedDateTimeDemo
 * @author: Mr.Zhang
 * @create: 2022-07-26 16:27
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2022-07-26T16:27:21.642+08:00[Asia/Shanghai]
    }
}
