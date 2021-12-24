
/**
 * 用于存放配置信息
 * mpf
 */
public class config {
  /** 路径  mpf*/
  // 当前项目的绝对路径
  final static String path_project = new String("F:/object/javapritace/pritace_2021_12_21/toolOfPublish/");
  // 小学科学项目的路径
  // final static String path_project = new String("F:/object/science-sj-teacher/Science-SJ-Teacher/");
  // 存放脚本的相对路径
  final static String path_bat = new String("bat/");
  // 存放日志的相对路径
  final static String path_log = new String("log/");
  
  /** 脚本 mpf*/
  // 读取日志的最后一行
  final static String bat_getFileLastLine = new String("cmd /c readFileLastLine.bat " + config.path_project + "/log/packlog.txt");
  // 写日志 需要一个参数为写入的内容
  final static String bat_writeLog = new String("cmd /c writeLog.bat");
  
  /** 命令 mpf*/
  final static String command_test = new String("ping www.stackabuse.com");
  // 获取当前位置的脚本
  final static String command_getNowPath = new String("cmd /c echo %cd%");
  // 获取最后一次提交的id
  final static String command_getLastCommitId = new String("cmd /c git rev-parse --short HEAD");

}
