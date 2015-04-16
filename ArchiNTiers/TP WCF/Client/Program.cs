using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using share;
using System.ServiceModel;

namespace Client
{
    class Program
    {
        static void Main(string[] args)
        {
            IServiceRecette recetteProxy = new ChannelFactory<IServiceRecette>("RecetteClient").CreateChannel();

            Recette recette = recetteProxy.newRecette("Frites");
            recette.ingredients.Add("Pommes de terres");
            recette.ingredients.Add("huile");
            recetteProxy.addRecette(recette);

            Recette recette2 = recetteProxy.newRecette("Hamburger");
            recette2.ingredients.Add("Steack");
            recette2.ingredients.Add("Pain");
            recette2.ingredients.Add("Sauce");
            recette2.ingredients.Add("Salade");
            recetteProxy.addRecette(recette2);

            Recette recette3 = recetteProxy.newRecette("Sandwich");
            recette3.ingredients.Add("Pain");
            recette3.ingredients.Add("Jambon");
            recette3.ingredients.Add("Beurre");
            recetteProxy.addRecette(recette3);

            Recette recette4 = recetteProxy.newRecette("Sandwich");
            recetteProxy.addRecette(recette4);

            Console.WriteLine("Liste des recettes : ");
            foreach (Recette rec in recetteProxy.listeBase())
            {
                Console.WriteLine(rec.nom);
            }
            Console.WriteLine();

            Console.WriteLine("Rechercher de recette, taper l'ingrédient : ");
            List<Recette> res = recetteProxy.rechercheParNomIngredient(Console.ReadLine());
            foreach (Recette r in res) {
                Console.WriteLine("Recette : " + r.nom);
            }
            Console.WriteLine();

            Console.WriteLine("Supprimer une recette de votre séléction courante, taper la recette : ");
            recetteProxy.deletecourante(Console.ReadLine());
            Console.WriteLine("Voici votre séléction courante : ");
            List<Recette> ress = recetteProxy.getInfoCourante();
            foreach (Recette r in ress) {
                Console.WriteLine(r.nom);
            }

            Console.ReadLine();

        }

    }
}
