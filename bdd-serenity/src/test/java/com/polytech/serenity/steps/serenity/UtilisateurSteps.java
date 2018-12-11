package com.polytech.serenity.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.polytech.serenity.pages.DictionnairePage;

import net.thucydides.core.annotations.Step;

public class UtilisateurSteps {

    DictionnairePage dictionnaire;

    @Step
    public void saisit_mot(String motCles) {
        dictionnaire.entrer_mots_cles(motCles);
    }

    @Step
    public void lance_la_recherche() {
        dictionnaire.rechercher_anime();
    }

    @Step
    public void doit_voir_la_definition(String definition) {
        assertThat(dictionnaire.recuperer_definitions(), hasItem(containsString(definition)));
    }
    
    @Step
    public void est_sur_la_homepage() {
        dictionnaire.open();
    }
    
    @Step
    public void est_sur_le_shop() {
    	est_sur_la_homepage();
    	dictionnaire.aller_sur_la_page_shop();
    }
    
    @Step
    public void est_sur_le_account() {
    	est_sur_la_homepage();
    	dictionnaire.aller_sur_la_page_account();
    }
    
    @Step
    public void recherche_manga_prix(String nom) {
    	dictionnaire.recherche_anime_shop(nom);
    }
    
    @Step
    public void doit_trouver_prix(String prix) {
    	assertThat(dictionnaire.recuperer_prix(), hasItem(containsString(prix)));
    }
    
    @Step
    public void connection(String login, String mdp) {
    	dictionnaire.connexion(login, mdp);
    }
    
    @Step
    public void ajout_anime_liste(String nom) {
    	dictionnaire.ajout_anime(nom);
    }
    
    @Step
    public void doit_trouver_dans_liste(String nom) {
    	dictionnaire.access_liste();
    	assertThat(dictionnaire.recuperer_liste(), hasItem(containsString(nom)));
    }
    
    @Step
    public void recherche_anime(String nom) {
    	dictionnaire.recherche(nom);
    }
    
    @Step 
    public void veut_noter(String nom, String note) {
    	dictionnaire.access_liste();
    	dictionnaire.noter(nom, note);
    }
    
    @Step 
    public void message_liste(String message) {
    	assertThat(dictionnaire.recuperer_message_liste(), hasItem(containsString(message)));
    }
    
    @Step 
    public void est_sur_la_page_notif() {
    	dictionnaire.aller_sur_notif();
    }
    
    @Step 
    public void aucun_notifications() {
    	dictionnaire.pas_notif();
    }
    
    @Step 
    public void message_notifications(String message) {
    	assertThat(dictionnaire.recuperer_message_notif(), hasItem(containsString(message)));
    }
    
    @Step 
    public void est_sur_la_page_confid() {
    	dictionnaire.aller_sur_page_confid();
    }
    
    @Step 
    public void change_confid_anime(String etat) {
    	dictionnaire.change_confid(etat);
    }
    
    @Step 
    public void message_confid(String message) {
    	assertThat(dictionnaire.recuperer_message_confid(), hasItem(containsString(message)));
    }
    
    @Step
    public void synopsis(String sypnosis) {
    	assertThat(dictionnaire.recuperer_sypnosis(), hasItem(containsString(sypnosis)));
    }
    
    @Step
    public void studio(String studio) {
    	assertThat(dictionnaire.recuperer_studio(), hasItem(containsString(studio)));
    }
    
    @Step
    public void recommandation(String nom) {
    	recherche_anime(nom);
    	dictionnaire.aller_sur_recommandation();
    }
    
    @Step
    public void doit_trouver_la_recommandation(String nom) {
    	assertThat(dictionnaire.recuperer_recommandation(), hasItem(containsString(nom)));
    }
    
    @Step
    public void adaptation(String nom) {
    	assertThat(dictionnaire.recuperer_adaptation(), hasItem(containsString(nom)));   	
    }
}