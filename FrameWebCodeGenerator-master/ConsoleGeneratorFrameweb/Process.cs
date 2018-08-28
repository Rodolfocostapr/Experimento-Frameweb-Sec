using System;
namespace GeradorFrameweb
{
    public abstract class Process: IProcessor
    {
        public Config config { get; set; }

        public Process(Config _config){
            this.config = _config;
        }

        public abstract void Execute(Componete componente);
    }
}
