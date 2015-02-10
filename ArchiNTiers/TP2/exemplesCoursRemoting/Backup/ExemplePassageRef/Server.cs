using System;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using System.Collections;

namespace RemotingSamples {
  public class Sample {

    public static int Main(string [] args) {

        // on va avoir besoin de passer des ref distantes au serveur
        // on va donc regler le canal, avec le niveau de securite adequate
        // c'est un peu complique ...
        // Plus d'explications : http://msdn2.microsoft.com/fr-fr/library/5dxse167(VS.80).aspx

        // Creating a custom formatter for a TcpChannel sink chain.
        BinaryServerFormatterSinkProvider provider = new BinaryServerFormatterSinkProvider();
        provider.TypeFilterLevel = System.Runtime.Serialization.Formatters.TypeFilterLevel.Full;
        // Creating the IDictionary to set the port on the channel instance.
        IDictionary props = new Hashtable();
        props["port"] = 8085;
        // Pass the properties for the port setting and the server provider in the server chain argument. (Client remains null here.)
        TcpChannel chan = new TcpChannel(props, null, provider);
        // TcpChannel chan = new TcpChannel(8085); Si on fait juste cette ligne au lieu de tout ce qui est au dessus, on a une erreur de securite
      
      ChannelServices.RegisterChannel(chan, true);
      Type t = Type.GetType("RemotingSamples.HelloServer,Share");
      RemotingConfiguration.RegisterWellKnownServiceType(Type.GetType("RemotingSamples.HelloServer,Share"), "SayHello", WellKnownObjectMode.SingleCall);
      System.Console.WriteLine("Appuyez sur <entree> pour sortir...");
      System.Console.ReadLine();
      return 0;
    }
  }
}