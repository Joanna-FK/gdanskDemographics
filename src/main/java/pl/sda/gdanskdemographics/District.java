package pl.sda.gdanskdemographics;

public class District {
    private String districtName;
    private String gender;
    private Integer ageUnderEighteen;
    private Integer ageFromEighteenToFiftyNine;
    private Integer ageFromSixteenToSixtyFour;
    private Integer ageOverSixtyFour;

    public District(String districtName,
                    String gender,
                    Integer ageUnderEighteen,
                    Integer ageFromEighteenToFiftyNine,
                    Integer ageFromSixteenToSixtyFour,
                    Integer ageOverSixtyFour) {
        this.districtName = districtName;
        this.gender = gender;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromEighteenToFiftyNine = ageFromEighteenToFiftyNine;
        this.ageFromSixteenToSixtyFour = ageFromSixteenToSixtyFour;
        this.ageOverSixtyFour = ageOverSixtyFour;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAgeUnderEighteen() {
        return ageUnderEighteen;
    }

    public Integer getAgeFromEighteenToFiftyNine() {
        return ageFromEighteenToFiftyNine;
    }

    public Integer getAgeFromSixteenToSixtyFour() {
        return ageFromSixteenToSixtyFour;
    }

    public Integer getAgeOverSixtyFour() {
        return ageOverSixtyFour;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                ", gender='" + gender + '\'' +
                ", ageUnderEighteen=" + ageUnderEighteen +
                ", ageFromEighteenToFiftyNine=" + ageFromEighteenToFiftyNine +
                ", ageFromSixteenToSixtyFour=" + ageFromSixteenToSixtyFour +
                ", ageOverSixtyFour=" + ageOverSixtyFour +
                '}';
    }
}
