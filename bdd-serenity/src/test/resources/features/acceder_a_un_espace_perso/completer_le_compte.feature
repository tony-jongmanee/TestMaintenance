# language: fr
Fonctionnalité: Ajouter des oeuvres en favori/dans sa liste
  En tant qu'utilisateur
  Je souhaite completer mon profil
  Afin de le personnaliser

  Scénario: Ajouter un anime dans sa liste
  	Soit un utilisateur sur la page homepage
  	Quand l'utilisateur se connecte avec ses id "" et ""
  	Quand l'utilisateur veut ajouter  l'anime "Shirobako" dans sa liste
		Alors il devrait trouver "Shirobako" dans sa liste
		    
  Scénario: Noter un anime deja ajouté dans sa liste
    Soit un utilisateur sur la page de homepage
    Quand l'utilisateur veut noter l'anime "Shirobako" pour donner "(10) Masterpiece"
    Alors on doit le renvoyer "Successfully updated entry."
    
    