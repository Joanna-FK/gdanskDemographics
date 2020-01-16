package pl.sda.gdanskdemographics;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        District[] districts = loadDistricts();
        Analyzer analyzer = new Analyzer(districts);
        analyzer.findByName("ZASPA");

        Integer ageUnderEighteen = null;
        Integer ageFromEighteenToFiftyNine = null;
        Integer ageFromSixteenToSixtyFour = null;
        Integer ageOverSixtyFour = null;
        District singleDistrictName = analyzer.nameWithLargestResidents("mężczyźni", ageFromEighteenToFiftyNine);
        System.out.println(singleDistrictName.getDistrictName());

        analyzer.mostResidentOfGender();
        System.out.println();



    }

    private static District[] loadDistricts() throws IOException {
        String loadedData = FileLoaderUtil.readFileAsSingleStringByFilesReadString("data.csv");
        String[] rows = loadedData.split("\r\n");

        District[] districts = new District[rows.length - 1];
        for (int i = 1; i < rows.length; i++) {
            String[] splitRow = rows[i].split(";");

            District singleDistrict = new District(
                    splitRow[0],
                    splitRow[1],
                    Integer.valueOf(splitRow[2].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[3].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[4].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[5].replaceAll(" ", "")));

            districts[i - 1] = singleDistrict;
        }
        return districts;
    }

/*static void readData(){
      Scanner scanner =  new Scanner(System.in);
      menu();
         int number = scanner.nextInt();
        switch (number) {
            case 1: opcjaPierwsza();
            break;
            case 2:opcjaDruga();
            break;
            case 3: opcjaTrzecia();

        }
    }
    private static void opcjaDruga() {
        System.out.println("Wyszukiwanie danych po kryterium wiekowym ");
    }
    private static void opcjaPierwsza() {
        System.out.println("Wyszukiwanie danych po nazwie dzielnicy");
    }
    private static void opcjaTrzecia() {
        System.out.println("Wyszukiwanie danych po nazwie płci");
    }
    private static void menu (){
        System.out.println("Wybierz opcję wyszukiwania danych: \n 1. Kryterium wiekowe; \n 2. Nazwa dzielnicy; \n 3. Płeć; \n  ");
    }*/

}
