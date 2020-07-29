package com.ssc.demosscresult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SSCResultCmdRunner implements CommandLineRunner {


    @Autowired StudentRepository repository;
    @Override
    public void run(String... args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://Users//KAPIL//Downloads//chromedriver_win32//chromedriver.exe");


        Map<String, String> input = new HashMap<String, String>();
        input.put("D103090","Vaishali");
        input.put("D103198","Usha");

        Iterator<String> iterator = input.keySet().iterator();
        List<Student> list = new ArrayList<Student>();
        while(iterator.hasNext()) {
            String regno = iterator.next();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://mahresult.nic.in/sscmarch2020/sscmarch2020.htm");
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div/input")).sendKeys(regno);
            driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/input")).sendKeys(input.get(regno));
            driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/input")).submit();

            Student std = new Student();
            String studentName = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/p[1]")).getText();
            printString(studentName.substring(5,studentName.length()).trim());
            std.setStudentName(studentName.substring(5,studentName.length()).trim());
            std.setRegno(regno);
            std.setMothersName(input.get(regno));

            String enCode = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[1]")).getText();
            printString(enCode);
            std.setEnCode(enCode);

            String enSubName = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[2]")).getText();
            printString(enSubName);
            std.setEnSubjectName(enSubName);

            String enMarksObtained = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]")).getText();
            printString(enMarksObtained);
            std.setEnMarksObtained(enMarksObtained);

            String mrCode = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[2]/td[1]")).getText();
            std.setMrCode(mrCode);
            printString(mrCode);

            String mrSubName = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[2]/td[2]")).getText();
            printString(mrSubName);
            std.setMrSubjectName(mrSubName);

            String mrMarksObtained = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[2]/td[3]")).getText();
            printString(mrMarksObtained);
            std.setMrMarksObtained(mrMarksObtained);

            String hnCode = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[3]/td[1]")).getText();
            printString(hnCode);
            std.setHnCode(hnCode);

            String hnSubName = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[3]/td[2]")).getText();
            printString(hnSubName);
            std.setHnSubjectName(hnSubName);

            String hnMarksObtained = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[3]/td[3]")).getText();
            printString(hnMarksObtained);
            std.setHnMarksObtained(hnMarksObtained);

            String mathCode = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[4]/td[1]")).getText();
            printString(mathCode);
            std.setMathCode(mathCode);

            String mathSubName = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[4]/td[2]")).getText();
            printString(mathSubName);
            std.setMathSubjectName(mathSubName);

            String mathMarksObtained = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[4]/td[3]")).getText();
            printString(mathMarksObtained);
            std.setMathMarksObtained(mathMarksObtained);

            String sciCode = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[5]/td[1]")).getText();
            printString(sciCode);
            std.setSciCode(sciCode);

            String sciSubName = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[5]/td[2]")).getText();
            printString(sciSubName);
            std.setSciSubjectName(sciSubName);

            String sciMarksObtained = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[5]/td[3]")).getText();
            printString(sciMarksObtained);
            std.setSciMarksObtained(sciMarksObtained);

            String ssCode = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[6]/td[1]")).getText();
            printString(ssCode);
            std.setSsCode(ssCode);

            String ssSubName = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[6]/td[2]")).getText();
            printString(ssSubName);
            std.setSsSubjectName(ssSubName);

            String ssMarksObtained = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[6]/td[3]")).getText();
            printString(ssMarksObtained);
            std.setSsMarksObtained(ssMarksObtained);

            String percentage = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[7]/td[2]")).getText();
            printString(percentage);
            std.setPercentage(percentage);

            String result = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[8]/td[2]")).getText();
            printString(result);
            std.setResult(result);

            String totalMarksObtained = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[7]/td[4]")).getText();
            printString(totalMarksObtained);
            std.setMarksObtined(totalMarksObtained);

            String outOfMarks = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[8]/td[4]/b")).getText();
            printString(outOfMarks);
            std.setTotalMarks(outOfMarks);

            repository.save(std);

            list.add(std);
            System.out.println(std);
            System.out.println(list);

            driver.close();
        }

    }

    private void printString(String str){
        System.out.println(str);
    }
}
