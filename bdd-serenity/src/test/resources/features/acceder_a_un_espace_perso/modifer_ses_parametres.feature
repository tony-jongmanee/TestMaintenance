# language: fr
Fonctionnalité: Modifier ses paramètres
  En tant qu'utilisateur
  Je souhaite modifier mes paramètres
  Afin de gérer mon profil

  Scénario: Changer mes notifications
  	Soit un utilisateur sur la page account
  	Quand l'utilisateur veut changer ses notifications
  	Quand l'utilisateur ne veut plus recevoir de notification
		Alors on doit le renvoyer "Successfully updated. "
		    
  Scénario: Changer la confidentialité des listes
  	Soit un utilisateur sur la page account
  	Quand l'utilisateur veut changer la confidentialité de sa liste anime en "Private"
  	Quand on doit le notifier "Your List Settings have been updated."
    
    