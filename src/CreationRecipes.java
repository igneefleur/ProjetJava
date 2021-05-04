import java.util.ArrayList;
import java.util.Arrays;

public class CreationRecipes {

public CreationRecipes(Modele m) {
		Recette r1 = new Recette(1,"Moelleux au chocolat",2,new String[]{"Sucre", "Moelleux"},"Etape 1 : \n Faire fondre le chocolat \n"
                + "Etape 2 : \n Ajouter le beurre en morceaux peu a peu et l'incorporer pour obtenir un crame bien lisse. \n "
                + "Etape 3 : \n Mettre la farine et le sucre glace dans un saladier. Ajouter les oeufs entiers et melanger jusqu'a obtention d'une amulsion homogane. \n "
                + "Etape 4 : \n Verser le melange chocolat-beurre sur cette preparation. Malanger. \n "
                + "Etape 5 : \n Beurrer et fariner 6 moules individuels ou un grand moule. \n "
                + "Etape 6 : \n Verser la preparation et mettre a four chaud (200 C) - 10 min pour les petits gateaux, 15 pour le grand. \n "
                + "Etape 7 : \n Servir tiade avec une crame anglaise (le centre doit atre coulant) ou servir froid nappa de ganache au chocolat."
                ,false,"./images/moelleux_chocolat.jpg"
                );
		Recette r2 = new Recette(2,"Crepes",1,new String[]{"Sucre"},"Etape 1 : \n Dans un saladier, melanger la farine, le sel et le sucre. \n "
                + "Etape 2 : \n Faire une Fontaine \n "
                + "Etape 3 : \n Ajouter les oeufs et commencer a les incorporer a la farine avec une cuillere en bois, ajouter le beure fondu (tiadi) peu a peu et bien malaxer.\n"
                + "Etape 4 : \n Incorporer le lait (par petites quantites au debut pour eviter les grumeaux), ajouter le parfum. \n "
                + "Etape 5 : \n Faire cuire les crepes dans une poale chaude huilae."
                ,false,"./images/crepes.jpg"
				);
		Recette r3 = new Recette(3,"Quiche",1,new String[]{"Sale"},
                "Etape 1 \n Prechauffer le four, etaler la pate dans le moule \n "
                + "Etape 2 \n La piquer avec une fourchette. Parsemer de copeaux de beurre \n "
                + "Etape 3 : \n Faire rissoler les lardons a la poele \n "
                + "Etape 4 : \n Battre les oeufs, la creme fraiche et le lait \n"
                + "Etape 5 : \n Ajouter les lardons \n "
                + "Etape 6 : \n Assaisonner de sel, poivre et de muscade \n "
                + "Etape 7 : \n Verser sur la pate \n "
                + "Etape 8 : \n Cuire 45 a 50min \n "
                ,false,"./images/quiche.jpg"
				);
		Recette r4 = new Recette(4,"Pizza",1,new String[]{"Sale"},
		        "Etape 1 \n Verser la farine dans un grand saladier et y faire un puits. \n\n "
		        + "Etape 2 \n Verser la levure, le sel et le sucre dans un verre doseur. Ajouter 1/4 de litre d'eau tiede, bien melanger. Couvrir d'un film plastique et laisser reposer environ 10 minutes (jusqu'a l'apparition d'une mousse brune bien epaisse en surface). \n\n "
		        + "Etape 3 : \n Verser le melange du verre doseur dans le saladier, melanger a la main. Puis quand la pate n'est plus collante petrir environ 5 minutes a la main sur une surface farinee. Arroser d'un peu d'huile d'olive, puis petrir a nouveau environ 5 minutes. \n\n "
		        + "Etape 4 : \n Laisser reposer au moins 1 h sous un linge humide dans un endroit tiede (a cota d'un radiateur, d'une cheminee ou d'un poele en hiver). \n\n "
		        + "Etape 5 : \n Apras repos, petrir quelques instants puis diviser la pate en trois boules agales (on peut en congeler). Etaler la pate sur une surface farinee. Badigeonner la plaque d'un peu d'huile d'olive avant d'y appliquer la pate. Cuisson 10 minutes a 220 C (thermostat 7-8).\n\n "
		        ,false,"./images/pizza.jpg"
				);
		Recette r5 = new Recette(5,"Croque Monsieur",1,new String[]{"Sale"},
                "Etape 1 \n Melanger dans un saladier la creme, le gruyere, saler et poivrer a votre gout.  \n "
				+ "Etape 2 : \n Prendre une tranche de pain de mie etaler dessus le melange creme/gruyere, poser dessus 1/2 tranche de jambon, poser dessus un tranche de pain de mie sur laquelle on a encore etale le meme melange.  \n"
				+ "Etape 3 : \n Avec ces proportions on doit pouvoir faire 12 croques.  \n"
				+ "Etape 4 : \n Mettre au four a mi-hauteur Th 7 pendant 20 mn.  \n"
				,false,"./images/croque_monsieur.jpg"
				);
		Recette r6 = new Recette(6,"Cookie",1,new String[]{"Sale"},
                "Etape 1 \n Travaillez le beurre mou avec les deux sucres jusqu'a obtention d'un melange homogene.\n "
				+ "Eatpe 2 : \n Ajoutez les oeufs et melangez bien. \n "
				+ "Etape3 : \n Joignez la farine tamisee, le sel et la levure en poudre.\n"
				+ "Etape 4 : \n Melangez a nouveau. \n "
				+ "Etape 5 : \n Rajoutez les pepites de chocolat et melangez. \n "
				+ "Etape 6 : \n Recouvrez le plateau du four de papier cuisson ou sulfurise, et a l'aide de 2 cuillares a cafe, disposez-y des petits tas de pate de la valeur d'une noix. \n "
				+ "Etape 7 : \n Veillez a bien les espacer car la pate s'etale assez fort. \n "
				+ "Etape 8 : \n Enfournez et comptez une dizaine de minutes de cuisson (four prachauffa a 180 C). \n"
				+ "Etape 9 : \n Laissez les cookies cuits sur une grille pour les refroidir. \n"
				,false,"./images/cookie.jpg"
				);
		
		ArrayList<Recette> r = new ArrayList<Recette>(Arrays.asList(r1,r2,r3,r4,r5,r6));
		for (int i=0; i<r.size(); i++) {
			m.ajouterRecette(r.get(i));
		}
		m.saveRecettes();
	}
	
}
