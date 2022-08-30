const enviar = document.querySelector("button");
const Icpf = document.querySelector(".cpf");
const Inome = document.querySelector(".nomeCompleto");
const IdataNascimento = document.querySelector(".dataNascimento");
const Iemail = document.querySelector(".email");
const Itelefone = document.querySelector(".telefone");
const ItelefoneFixo = document.querySelector(".telefoneFixo");
const Iwhatsapp = document.querySelector("whatsapp");

function novoCliente(){
    fetch("http://localhost:8080/clientes/",
    {
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            cpfCliente: Icpf.value,
            nome: Inome.value,
            dataNascimento: IdataNascimento.value,
            email: Iemail.value,
            telefone: Itelefone.value,
            telefoneFixo: ItelefoneFixo.value,
            whatsapp: Iwhatsapp.value
        })
    })
    .then(function () {console.log(res)})
    .catch(function () {console.log(res)})
};

function limpar(){
    Icpf.value = "";
    Inome.value = "";
    IdataNascimento.value = "";
    Iemail.value = "";
    Itelefone.value = "";
    ItelefoneFixo.value = "";
    Iwhatsapp.value = "";
}

enviar.addEventListener("submit", function(e) {
    e.preventDefault();
    
    novoCliente();
    limpar();
});