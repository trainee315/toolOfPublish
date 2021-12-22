
/**
 * 主要控制方法
 * mpf
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class contral {

  // 上一次发布的id
  private String lastId = "";
  // 当前发布的id
  private String NewPublishId = "";

  public void constructor() {
    this.initialize();

  }

  /**
   * 获取当前最后一次提交的id
   * mpf
   **/
  public String getLastCommitId() throws IOException {
    String id = "";
    BufferedReader reader = this.execBat(config.command_getLastCommitId, null, new File(config.path_project));
    while ((id = reader.readLine()) != null) {
      return id;
    }
    return null;
  }

  /**
   * 获取上次发布的id mpf
   **/
  public String getLastPublisId() throws IOException {
    BufferedReader reader = this.execBat(config.bat_getFileLastLine, null, new File(config.path_project + "/bat"));
    String id = reader.readLine().substring(9, 17);
    return id;
  }

  /**
   * 执行某个脚本:并输出并返回结果 mpf
   **/
  public BufferedReader execBat(String command, String[] envp, File file) throws IOException {

    Process process = Runtime.getRuntime().exec(command, envp, file);
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    return reader;
  }

  /** 获取当前的日期和时间 mpf */
  public String getNowDate() {
    String time = "";

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    time = formatter.format(date);
    time = time.replaceAll(" ", "");
    return time;
  }

  /** 初始化 mpf */
  public void initialize() {
    try {
      this.lastId = this.getLastPublisId();
      this.NewPublishId = this.getLastCommitId();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      System.out.println("the error of get commit id!!!");
      e.printStackTrace();
    }

  }
}
