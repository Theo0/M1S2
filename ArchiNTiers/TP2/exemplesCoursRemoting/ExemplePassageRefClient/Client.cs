using System;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;


namespace RemotingSamples
{
    public class Client
    {
        public static int Main(string[] args)
    {
        TcpChannel chan = new TcpChannel(8086);
      ChannelServices.RegisterChannel(chan, true);
      ForwardMe param = new ForwardMe();
      HelloServer obj = (HelloServer)Activator.GetObject(typeof(RemotingSamples.HelloServer), "tcp://localhost:8085/SayHello");
      if (obj == null) System.Console.WriteLine("Impossible de trouver le serveur");
      else Console.WriteLine(obj.HelloMethod("Homme des cavernes",param));
      Console.Read();
      return 0;
    }
    }
}