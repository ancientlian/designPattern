package ProxyPattern;

/**
 * 身份验证类，业务类，它提供方法Validate()来实现身份验证
 */
public class AccessValidator {
    //模拟实现登录验证
    public Boolean validate(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户？");
        if ("杨过".equals(userId)) {
            System.out.printf("%s登录成功！\n", userId);
            return true;
        } else {
            System.out.printf("%s登录失败！" + userId);
            return false;
        }
    }


}
