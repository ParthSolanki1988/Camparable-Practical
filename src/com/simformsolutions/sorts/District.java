package com.simformsolutions.sorts;

public class District implements Comparable<District> {

  private String districtName;
  private int codeOfDistrict;

  District(String districtName, int codeOfDistrict){
    this.districtName = districtName;
    this.codeOfDistrict = codeOfDistrict;
  }

  @Override
  public String toString() {
    return "Country{" +
            "stateName='" + districtName + '\'' +
            ", codeOfState='" + codeOfDistrict + '\'' +
            '}';
  }


  /**
   * @Sort : decreasing order
   */
  @Override
  public int compareTo(District district) {
    if (this.codeOfDistrict == district.codeOfDistrict){
      return 1;
    } else if (this.codeOfDistrict > district.codeOfDistrict) {
      return 0;
    }
    else {
      return -1;
    }

    /**
     * @Sort : Increasing order
     */
//    @Override
//    public int compareTo(District district) {
//      if (this.codeOfDistrict == district.codeOfDistrict){
//        return 0;
//      } else if (this.codeOfDistrict > district.codeOfDistrict) {
//        return -1;
//      }
//      else {
//        return 1;
//      }

  }


}
