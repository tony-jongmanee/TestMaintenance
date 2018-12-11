# language: fr
Fonctionnalité: Trouver des recommandations
  En tant qu'utilisateur
  Je souhaite trouver des recommandations
  Afin de decouvrir d'autres oeuvres

  Scénario: Trouver des recommandations a partir d'un autre anime
  	Soit un utilisateur sur la page homepage
  	Quand l'utilisateur veut trouver un anime proche de "Shirobako"
  	Alors il devrait trouver la recommandation "Bakuman."
    
  Scénario: Trouver une autre adaptation d'un anime
    Soit un utilisateur sur la page de homepage
    Quand l'utilisateur veut rechercher une adaptation de "Shirobako"
    Alors il devrait trouver l'adaptation "	Shirobako: Kaminoyama Koukou Animation Doukoukai"