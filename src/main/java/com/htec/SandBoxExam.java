package com.htec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SandBoxExam {

    private static WebDriver myDriver;


    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        myDriver.manage().window().maximize();
    }
    public static String getCurrentUrl() {
        myDriver.get("https://qa-sandbox.ni.htec.rs/");
        return myDriver.getCurrentUrl();
    }


    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
        }
    }

    public static String logMeIn(String email, String password) {
        WebElement logInBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/a[1]"));
        logInBtn.click();

        WebElement emailInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[2]/input"));
        emailInput.click();
        emailInput.sendKeys(email);

        WebElement passwordInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div[2]/input"));
        passwordInput.sendKeys(password);

        WebElement logMeInBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/button"));
        logMeInBtn.click();
        myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div/div[1]/div/div[1]/div"));
        return null;
    }
        public static String createTestCase(){
        WebElement clickTestCaseCard = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/a[3]/div[1]"));
        clickTestCaseCard.click();

        WebElement createNewTestCaseBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div/div/div/span/a"));
        createNewTestCaseBtn.click();

        WebElement testCaseOneTitleInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[1]/div[2]/input"));
        testCaseOneTitleInput.sendKeys("#1");

        WebElement  testCaseOneDescInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/textarea"));
        testCaseOneDescInput.sendKeys("Check if creating a Test Case is working properly");

        WebElement testCaseOneTestStepOneInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
        testCaseOneTestStepOneInput.sendKeys("Test Case is created");

        WebElement testCaseOneActualResultInput = myDriver.findElement(By.xpath("//*[@id=\"step-0\"]"));
        testCaseOneActualResultInput.sendKeys("1. Navigate to QA Sandbox home page");

        WebElement testCaseOneCreateSecondStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[3]/div[2]/div/div"));
        testCaseOneCreateSecondStep.click();

        WebElement testCaseOneSecondStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-1\"]"));
        testCaseOneSecondStepInput.sendKeys("2. Click on Test Cases ");

        WebElement testCaseOneCreateThridStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[4]/div[2]/div/div"));
        testCaseOneCreateThridStep.click();

        WebElement testCaseOneThirdStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-2\"]"));
        testCaseOneThirdStepInput.sendKeys("3. Fill each field with valid input");

        WebElement testCaseOneCreateFourthStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[5]/div[2]/div/div"));
        testCaseOneCreateFourthStep.click();

        WebElement testCaseOneFourthStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-3\"]"));
        testCaseOneFourthStepInput.sendKeys("Submit Test Case");

        WebElement checkAutomatedBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[5]/label[2]/div/div[1]"));
        checkAutomatedBtn.click();

        WebElement submitBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[6]/button"));
        submitBtn.click();

            waitFor(5);


        WebElement confirmTestCaseIsSubmitted = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div/span[1]/a/div/div[1]/div"));
        return confirmTestCaseIsSubmitted.getText();


        }

        public static String createSecondTestCase(){


            WebElement createNewTestCaseBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div/div/div/span/a"));
            createNewTestCaseBtn.click();

            WebElement testCaseTwoTitleInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[1]/div[2]/input"));
            testCaseTwoTitleInput.sendKeys("#2");

            WebElement testCaseTwoDescInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/textarea"));
            testCaseTwoDescInput.sendKeys("Check if user can create an empty report");

            WebElement testCaseTwoExpectedResultInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
            testCaseTwoExpectedResultInput.sendKeys("Error messages appear requiring each field is filled");

            WebElement testCaseTwoActualResultInput = myDriver.findElement(By.xpath("//*[@id=\"step-0\"]"));
            testCaseTwoActualResultInput.sendKeys("1. Navigate to QA Sandbox home page");

            WebElement testCaseTwoCreateSecondStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[3]/div[2]/div/div"));
            testCaseTwoCreateSecondStep.click();

            WebElement testCaseTwoSecondStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-1\"]"));
            testCaseTwoSecondStepInput.sendKeys("2. Click on Reports Tab ");

            WebElement testCaseTwoCreateThridStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[4]/div[2]/div/div"));
            testCaseTwoCreateThridStep.click();

            WebElement testCaseTwoThirdStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-2\"]"));
            testCaseTwoThirdStepInput.sendKeys("3. Click on Submit button");


            WebElement checkAutomatedBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[5]/label[2]/div/div[1]"));
            checkAutomatedBtn.click();

            WebElement submitBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[6]/button"));
            submitBtn.click();

            waitFor(10);

            WebElement confirmSecondTestCaseIsSubmitted = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div/span[1]/a/div/div[1]/div"));
            return confirmSecondTestCaseIsSubmitted.getText();
        }

        public static String createThirdTestCase(){
            WebElement createNewTestCaseBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div/div/div/span/a"));
            createNewTestCaseBtn.click();

            WebElement testCaseThreeTitleInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[1]/div[2]/input"));
            testCaseThreeTitleInput.sendKeys("#3");

            WebElement testCaseThreeDescInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/textarea"));
            testCaseThreeDescInput.sendKeys("Check if user can create an empty project in the Playground tab");

            WebElement testCaseThreeExpectedResultInput = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
            testCaseThreeExpectedResultInput.sendKeys("Error message appears requiring Title name");

            WebElement testCaseThreeActualResultInput = myDriver.findElement(By.xpath("//*[@id=\"step-0\"]"));
            testCaseThreeActualResultInput.sendKeys("1. Navigate to QA Sandbox home page");

            WebElement testCaseThreeCreateSecondStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[3]/div[2]/div/div"));
            testCaseThreeCreateSecondStep.click();

            WebElement testCaseThreeSecondStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-1\"]"));
            testCaseThreeSecondStepInput.sendKeys("2. Click on Playground Tab ");

            WebElement testCaseThreeCreateThridStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[4]/div[2]/div/div"));
            testCaseThreeCreateThridStep.click();

            WebElement testCaseThreeThirdStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-2\"]"));
            testCaseThreeThirdStepInput.sendKeys("3. Click on New Project button");

            WebElement testCaseThreeCreateFourthStep = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[4]/div[5]/div[2]/div/div"));
            testCaseThreeCreateFourthStep.click();

            WebElement testCaseThreeFourthStepInput = myDriver.findElement(By.xpath("//*[@id=\"step-3\"]"));
            testCaseThreeFourthStepInput.sendKeys("Click on Submit button");

            WebElement checkAutomatedBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[5]/label[2]/div/div[1]"));
            checkAutomatedBtn.click();

            WebElement submitBtn = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[6]/button"));
            submitBtn.click();

            waitFor(10);

            WebElement confirmThirdTestCaseIsSubmitted = myDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div/span[1]/a/div/div[1]/div"));
            return confirmThirdTestCaseIsSubmitted.getText();



        }

































    }


