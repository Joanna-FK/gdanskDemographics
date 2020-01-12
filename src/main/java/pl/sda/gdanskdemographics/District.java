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
}
