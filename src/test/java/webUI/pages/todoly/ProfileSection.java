package webUI.pages.todoly;

import org.openqa.selenium.By;
import webUI.controls.Button;
import webUI.controls.Control;
import webUI.controls.TextBox;

public class ProfileSection {
    public Control settingsDialog = new Control(By.id("settingsDialog"));
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//button[span[text()='Ok']]"));
}