package Exercices.Heritage.Ex1;


    class ArticleEnSold extends Article{
        private double pourcentage;

        public ArticleEnSold(String nom, double prix, double pourcentage) {
            super(nom, prix);
            this.pourcentage = pourcentage;

        }

        public void afficher(){
            super.afficher();
            System.out.println("Le prix avec la reduction"+" "+(prix*pourcentage));
            System.out.println("T'as une reduction de 40% sur le prix d'origine");
        }
}
