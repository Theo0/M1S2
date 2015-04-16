using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace share
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom d'interface "IService1" à la fois dans le code et le fichier de configuration.
    [ServiceContract]
    public interface IServiceRecette
    {
        [OperationContract]
        string GetData(int value);

        [OperationContract]
        CompositeType GetDataUsingDataContract(CompositeType composite);

        [OperationContract]
        List<Recette> rechercheParNomIngredient(String nom);

        [OperationContract]
        Recette newRecette(String nom);

        [OperationContract]
        String getNomRecette(Recette rec);

        [OperationContract]
        void deletecourante(String nom);

        [OperationContract]
        void addRecette(Recette recette);

        [OperationContract]
        List<Recette> getInfoCourante();

        [OperationContract]
        List<Recette> listeBase();

        // TODO: ajoutez vos opérations de service ici
    }


    // Utilisez un contrat de données comme indiqué dans l'exemple ci-après pour ajouter les types composites aux opérations de service
    [DataContract]
    public class CompositeType
    {
        bool boolValue = true;
        string stringValue = "Hello ";

        [DataMember]
        public bool BoolValue
        {
            get { return boolValue; }
            set { boolValue = value; }
        }

        [DataMember]
        public string StringValue
        {
            get { return stringValue; }
            set { stringValue = value; }
        }
    }

    public class Recette {
        String _nom;
        List<String> _ingredients;

        public string nom
        {
            get { return _nom; }
            set { _nom = value; }
        }


        public List<String> ingredients {
            get { return _ingredients; }
            set { _ingredients = value; }
        }
    }
}

