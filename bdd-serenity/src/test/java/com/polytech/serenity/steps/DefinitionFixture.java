package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class DefinitionFixture {

    @Steps
    UtilisateurSteps utilisateur;

    @Soit("^un utilisateur sur la page homepage$")
    public void un_utilisateur_sur_la_page_homepage() throws Exception {
    	utilisateur.est_sur_la_homepage();
    }

    @Soit("^un utilisateur sur la page shop$")
    public void un_utilisateur_sur_la_page_shop() {
    	utilisateur.est_sur_la_homepage();
    	utilisateur.est_sur_le_shop();
    }
    
    @Soit("^un utilisateur sur la page account$")
    public void un_utilisateur_sur_la_page_account() {
    	utilisateur.est_sur_la_homepage();
    	utilisateur.est_sur_le_account();
    }
    
    @Quand("^l'utilisateur veut connaître le prix du manga \"([^\"]*)\"$")
    public void l_utilisateur_veut_connaitre_le_prix_du_manga(String nom) {
    	utilisateur.recherche_manga_prix(nom);
    }
    
    @Alors("^il devrait trouver le prix \"([^\"]*)\"$")
    public void il_devrait_trouver_le_prix(String prix) {
    	utilisateur.doit_trouver_prix(prix);
    }
    
    @Quand("^l'utilisateur se connecte avec ses id \"([^\"]*)\" et \"([^\"]*)\"$")
    public void l_utilisateur_se_connecte_avec_ses_id(String login, String mdp) {
    	utilisateur.connection(login, mdp);
    }
    
    @Quand("^l'utilisateur veut ajouter  l'anime \"([^\"]*)\" dans sa liste$")
    public void l_utilisateur_veut_ajouter_l_anime_dans_sa_liste(String nom) {
    	utilisateur.ajout_anime_liste(nom);
    }
    
    @Alors("^il devrait trouver \"([^\"]*)\" dans sa liste$")
    public void il_devrait_trouver_dans_sa_liste(String nom) {
    	utilisateur.doit_trouver_dans_liste(nom);
    }
    
    @Quand("^l'utilisateur veut noter l'anime \"([^\"]*)\" pour donner \"([^\"]*)\"$")
    public void l_utilisateur_veut_noter_l_anime_pour_donner(String nom, String note){
    	utilisateur.veut_noter(nom, note);
    }
    
    @Alors("^on doit le renvoyer \"([^\"]*)\"$")
    public void doit_recevoir(String message) {
    	utilisateur.message_liste(message);
    }
    
  	@Quand("^l'utilisateur veut changer ses notifications$")
  	public void l_utilisateur_veut_changer_ses_notifications() {
  		utilisateur.est_sur_la_page_notif();
  	}
  	
  	@Quand("^l'utilisateur ne veut plus recevoir de notification$")
  	public void l_utilisateur_ne_veut_plus_recevoir_de_notifications() {
  		utilisateur.aucun_notifications();
  	}
		
  	@Alors("^on doit le renvoyer \"([^\"]*)\"$")
  	public void on_doit_le_renvoyer(String message) {
  		utilisateur.message_notifications(message);
  	}
  	
  	@Quand("^l'utilisateur veut changer la confidentialité de sa liste anime en \"([^\"]*)\"$")
  	public void l_utilisateur_veut_changer_la_confidentialite_de_sa_liste_anime(String etat) {
  		utilisateur.est_sur_la_page_confid();
  		utilisateur.change_confid_anime(etat);
  	}
  	@Quand("^on doit le notifier \"([^\"]*)\"$)")
  	public void doit_etre_notifier(String message) {
  		utilisateur.message_confid(message);
  	}
  	
  	@Quand("^l'utilisateur veut rechercher le synopsis de \"([^\"]*)\"$")
  	public void l_utilisateur_veut_rechercher_le_synopsis(String nom) {
  		utilisateur.recherche_anime(nom);
  	}
  	
  	@Alors("^il devrait trouver le synopsis \"([^\"]*)\"$")
  	public void doit_trouver_le_synopsis(String synopsis) {
  		utilisateur.synopsis(synopsis);
  	}
  	
  	@Quand("^l'utilisateur veut rechercher le studio de \"([^\"]*)\"$")
  	public void l_utilisateur_veut_rechercher_le_studio(String nom) {
  		utilisateur.recherche_anime(nom);
  	}
  	
  	@Alors("^il devrait trouver le studio \"([^\"]*)\"$")
  	public void doit_trouver_le_studio(String studio) {
  		utilisateur.studio(studio);
  	}
  	
  	@Quand("^l'utilisateur veut trouver un anime proche de \"([^\"]*)\"$")
  	public void l_utilisateur_veut_trouver_un_anime_proche(String nom) {
  		utilisateur.recommandation(nom);
  	}
  	
  	@Alors("^il devrait trouver la recommandation \"([^\"]*)\"$")
  	public void il_devrait_trouver_la_recommandation(String nom) {
  		utilisateur.doit_trouver_la_recommandation(nom);
  	}
  	
    @Quand("^l'utilisateur veut rechercher une adaptation de \"([^\"]*)\"$)")
    public void l_utilisateur_veut_rechercher_une_adaptation(String nom) {
    	utilisateur.recherche_anime(nom);
    }
    
    @Alors("^il devrait trouver l'adaptation \"([^\"]*)\"$")
    public void doit_trouver_adaptation(String adaption) {
    	utilisateur.adaptation(adaption);
    }
}