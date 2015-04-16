using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using share;

namespace ServiceRecettes
{
    public static class BaseDonnees
    {
        private static List<Recette> _recettes = new List<Recette>();
        public static List<Recette> recettes
        {
            get { return _recettes; }
            set { _recettes = value; }
        }

    }

    [ServiceBehavior(InstanceContextMode = InstanceContextMode.PerSession)]
    public class ServiceRecette : IServiceRecette
    {
        public Recette recet = new Recette();
        List<Recette> baseRecettes = BaseDonnees.recettes;
        public List<Recette> selectionCour = new List<Recette>();

        string IServiceRecette.GetData(int value)
        {
            return "";
        }

        CompositeType IServiceRecette.GetDataUsingDataContract(CompositeType composite)
        {
            if (composite == null)
            {
                throw new ArgumentNullException("composite");
            }
            if (composite.BoolValue)
            {
                composite.StringValue += "Suffix";
            }
            return composite;
        }

        List<Recette> IServiceRecette.rechercheParNomIngredient(string nom)
        {
            selectionCour = new List<Recette>();
            List<Recette> listeRecettes = new List<Recette>();

            foreach (Recette rec in baseRecettes)
            {
                foreach (String ing in rec.ingredients)
                {
                    if (ing.Equals(nom))
                    {
                        listeRecettes.Add(rec);
                        selectionCour.Add(rec);

                    }
                }
            }

            return listeRecettes;
        }

        Recette IServiceRecette.newRecette(string nom)
        {
            Recette recette = new Recette();
            recette.nom = nom;
            recette.ingredients = new List<String>();
            return recette;
        }


        string IServiceRecette.getNomRecette(Recette rec)
        {
            return rec.nom;
        }

        public List<Recette> getInfoCourante()
        {
            return selectionCour;
        }

        void IServiceRecette.deletecourante(string nom)
        {
            Recette tmp = null;

            foreach(Recette r in selectionCour)
            {
                if (r.nom.Equals(nom))
                {
                    tmp = r;
                }
            }

            selectionCour.Remove(tmp);
        }

        void IServiceRecette.addRecette(Recette recette)
        {
            this.recet = recette;
            Boolean test = false;

            foreach (Recette rec in baseRecettes)
            {
                if (rec.nom.Equals(recette.nom))
                {
                    test = true;
                }
            }

            if (test == false)
            {
                baseRecettes.Add(recet);
            }
            else
            {
                Console.WriteLine("Recette déjà existante");
            }
        }


        public List<Recette> listeBase()
        {
            return baseRecettes;
        }
    }
}
