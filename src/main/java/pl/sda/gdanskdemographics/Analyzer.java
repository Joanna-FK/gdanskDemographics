package pl.sda.gdanskdemographics;

public class Analyzer {

    private District[] allDistricts;

    public Analyzer(District[] allDistricts) {
        this.allDistricts = allDistricts;
    }

    public void findByName(String districtName) {
        for (District singleDistrict : allDistricts) {
            if (singleDistrict.getDistrictName().contains(districtName)) {
                System.out.println(singleDistrict);
            }
        }
    }

    public District nameWithLargestResidents(String gender, Integer age) {
        District singleDistrictName = allDistricts[0];

        for (int i = 1; i < allDistricts.length-2; i++) {
            if (gender.equals("kobiety") || gender.equals("mężczyźni") &&
                   singleDistrictName.getAgeUnderEighteen() < allDistricts[i].getAgeUnderEighteen() ||
                    singleDistrictName.getAgeFromEighteenToFiftyNine()< allDistricts[i].getAgeFromEighteenToFiftyNine() ||
                    singleDistrictName.getAgeFromSixteenToSixtyFour() < allDistricts[i].getAgeFromSixteenToSixtyFour() ||
                    singleDistrictName.getAgeOverSixtyFour() < allDistricts[i].getAgeOverSixtyFour())
                     {
                         singleDistrictName = allDistricts[i];
                     }
        }
        return singleDistrictName;
    }

    public void mostResidentOfGender() {
        for (District allDistrict : allDistricts) {
           int  genderSum = allDistrict.getAgeOverSixtyFour() + allDistrict.getAgeFromSixteenToSixtyFour() + allDistrict.getAgeUnderEighteen() + allDistrict.getAgeFromEighteenToFiftyNine();
            System.out.println(allDistrict.getDistrictName() + " " + allDistrict.getGender() + " " + genderSum);
        }
    }
}


