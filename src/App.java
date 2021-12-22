import java.io.BufferedReader;
import java.io.File;

/**
 * 使用此应用进行项目的增量更新
 * 1. 打包与上一次发布后的资源增量包
 * a. 记录本次发布的id
 * 2. 发布
 * 3. 打包资源和代码
 * 4. 上传到服务器上
 * 5. 在服务器上解压
 * 6. 添加增量跟新包
 * 
 * 工具
 * 1. 获取当前文件夹
 * 2. 读写text文件
 * 3. 执行命令
 * mpf
 */
// 增量更新的命令 git archive -o f9ea26b_61d6c05.zip f9ea26b $(git diff f9ea26b 61d6c05
// --name-only)
public class App {

    /** 变量 mpf */
    final static contral contral = new contral();

    public static void main(String[] args) throws Exception {
        System.out.println(App.contral.getLastCommitId());
    }

}
