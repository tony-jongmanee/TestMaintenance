package com.polytech.serenity.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://myanimelist.net/")
public class DictionnairePage extends PageObject {

    public void entrer_mots_cles(String motCle) {
    	WebElementFacade search = find(By.className("search_input_home"));
        search.type(motCle);
    }
    
    public void aller_sur_la_page_shop() {
    	WebElementFacade shop = find(By.xpath("/html/body/div[1]/div/div[2]/div[2]/ul/li[6]/ul/li/a"));
    	shop.click();
    }
    
    public void aller_sur_la_page_account() {
    	WebElementFacade account = find(By.xpath("/html/body/div[1]/div/div[1]/div/div[7]/div/ul/li[8]/a"));
    	account.click();
    }
    
    public void recherche_anime_shop(String nom) {
    	WebElementFacade recherche = find(By.className("inputtext js-manga-store-search"));
    	WebElementFacade button = find(By.className("inputButton"));
    	recherche.type(nom);
    	button.click();
    	WebElementFacade account = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/section/div[1]/section[2]/div[1]/div/a[1]/span"));
    	account.click();
    }
    
    public List<String> recuperer_prix() {
        WebElementFacade prixList = find(By.className("price-wrap"));
        return prixList.findElements(By.tagName("span")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }

    public void rechercher_anime() {
    	WebElementFacade button = find(By.className("bt1"));
    	WebElementFacade resultat = find(By.xpath("//*[@id=\"tr_col_6\"]/td[2]/a"));
        button.click();
        resultat.click();
        
    }

    public void access_section_anime() {
    	WebElement lien = element(By.xpath("//*[@id=\"page\"]/div[4]/div[4]/ul/li[5]/ul/li[1]/a"));
    	cookie();
    	lien.click();
    }
    
    public List<String> recuperer_definitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }

    public void aller_sur_la_page_connexion() {

    	WebElementFacade connexion = find(By.id("btn_insc"));
    	connexion.click();
    }
    
    public void renseigner_les_id(String id, String mdp) {
    	WebElementFacade login = find(By.id("champ_login"));
    	WebElementFacade password = find(By.id("pass"));
    	login.type(id);
    	password.type(mdp);
    }
    
    public void connexion(String login, String mdp) {
    	WebElementFacade btn = find(By.className("btn-login"));
    	btn.click();
    	WebElementFacade input_login = find(By.id("loginUserName"));
    	WebElementFacade input_mdp = find(By.id("login-password"));
    	input_login.type(login);
    	input_mdp.type(mdp);
    	WebElementFacade btn_login = find(By.className("inputButton"));
    	btn_login.click();
    	
    }
    
    public void ajout_anime(String nom) {
    	WebElementFacade ajout_liste = find(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/ul/li[3]/a"));
    	ajout_liste.click();
    	WebElementFacade recherche = find(By.id("maSearchText"));
    	recherche.type(nom);
    	WebElementFacade add = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[4]/a"));
    	add.click();
    	WebElementFacade status = find(By.id("status25835"));
    	status.selectByVisibleText("Completed");
    	WebElementFacade addF = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody/tr[6]/td[2]/div/table/tbody/tr/td/input[1]"));
    	addF.click();
    }
    
    public void access_liste() {
    	WebElementFacade liste = find(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/ul/li[1]/a"));
    	liste.click();
    }
    
    public List<String> recuperer_liste() {
        WebElementFacade definitionList = find(By.xpath("/html/body/div[5]/div[3]/div/table/tbody[2]/tr[1]/td[4]"));
        return definitionList.findElements(By.tagName("a")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
    
    public void recherche(String nom) {
    	WebElementFacade barre_rechercher = find(By.id("topSearchText"));
    	barre_rechercher.type(nom);
    	WebElementFacade barre_btn= find(By.id("topSearchButon"));
    	barre_btn.click();
    	WebElementFacade anime = find(By.xpath("//*[@id=\"#revArea25835\"]"));
    	anime.click();
    }
    
    public void noter(String nom, String note) {
    	WebElementFacade edit = find(By.xpath("/html/body/div[5]/div[3]/div/table/tbody[2]/tr[1]/td[4]/div/span[1]/a"));
    	edit.click();
    	WebElementFacade barre_note = find(By.xpath("//*[@id=\"add_anime_score\"]"));
    	barre_note.selectByVisibleText(note);
    	WebElementFacade submit = find(By.xpath("/html/body/table/tbody/tr/td/div[3]/input"));
    	submit.click();
    }
    
    public List<String> recuperer_message_liste() {
        WebElementFacade definitionList = find(By.xpath("/html/body/div[1]/strong"));
        return definitionList.findElements(By.tagName("a")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
    	
    public void aller_sur_notif() {
    	WebElementFacade notif = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/ul/li[3]/a"));
    	notif.click();
    }
    
    public void pas_notif() {
    	WebElementFacade notif = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/label"));
    	notif.click();
    }
    
    public List<String> recuperer_message_notif() {
    	WebElementFacade notif = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]"));
        return notif.findElements(By.className("goodresult")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
    
    public void aller_sur_page_confid() {
    	WebElementFacade confid = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/ul/li[9]/a"));
    	confid.click();
    }
    
    public void change_confid(String etat) {
    	WebElementFacade privacy = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/table/tbody/tr[8]/td[2]/select"));
    	privacy.selectByVisibleText(etat);
    }
    

    
    public List<String> recuperer_message_confid() {
    	WebElementFacade confid = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]"));
        return confid.findElements(By.className("goodresult")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }    
    
    public List<String> recuperer_sypnosis() {
    	WebElementFacade confid = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td"));
        return confid.findElements(By.tagName("span")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
    
    public List<String> recuperer_studio() {
    	WebElementFacade studio = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/table/tbody/tr/td[1]/div/div[16]"));
        return studio.findElements(By.tagName("a")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
    
    public void aller_sur_recommandation() {
    	WebElementFacade recommandation = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/table/tbody/tr/td[2]/div/div[1]/ul/li[5]/a"));
    	recommandation.click();
    }
    
    public List<String> recuperer_recommandation() {
    	WebElementFacade confid = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/table/tbody/tr/td[2]/div/div[3]/table/tbody/tr/td[2]/div[2]/a[1]"));
        return confid.findElements(By.className("strong")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
    
    public List<String> recuperer_adaptation() {
    	WebElementFacade adaptation = find(By.xpath("/html/body/div[1]/div/div[3]/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]"));
        return adaptation.findElements(By.className("a")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
    
    
    public void cookie() {
    	WebElementFacade cookie = find(By.className("qc-cmp-button"));
    	cookie.waitUntilClickable().click();
    }
}