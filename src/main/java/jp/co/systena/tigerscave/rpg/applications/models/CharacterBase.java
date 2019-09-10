package jp.co.systena.tigerscave.rpg.applications.models;

import java.util.List;

public abstract class CharacterBase {
  protected List<String> jobNameList;
  protected List<String> charaNameList;
  protected List<String> attackWayList;
  protected List<String> RecoveryWayList;

  public void setJobNameList(List<String> jobList){
    for (String job : jobList) {
      this.jobNameList.add(job);
      switch (job) {
        case "戦士":
          this.attackWayList.add("剣");
          break;
        case "魔法使い":
          this.attackWayList.add("まほう");
          break;
        case "武闘家":
          this.attackWayList.add("拳");
          break;
        default:
          this.attackWayList.add("じたばた");
      }

      switch (job) {
        case "魔法使い":
          this.RecoveryWayList.add("まほう");
          break;
        default:
          this.RecoveryWayList.add("やくそう");
      }
    }
  }

  public abstract List<String> getJobList();

  public void setCharaNameList(List<String> nameList){
    this.charaNameList = nameList;
  }

  public abstract List<String> getNameList();
  public abstract List<String> getAttackWayList();
}
