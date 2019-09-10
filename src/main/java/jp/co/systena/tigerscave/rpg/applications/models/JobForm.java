package jp.co.systena.tigerscave.rpg.applications.models;

import java.util.List;

public class JobForm {
    private List<String> jobName;
    private List<String> charaName;

    //デフォルトの職業名と名前
    public List<String> getJobNameList() {
        return jobName;
    }

    public List<String> getCharaNameList() {
      return charaName;
    }

    public void setCharaNameList(List<String> charaName) {
      this.charaName.addAll(charaName);
    }

    public void setJobNameList(List<String> jobName) {
      this.jobName.addAll(jobName);
    }
}