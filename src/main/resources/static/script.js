document.addEventListener('DOMContentLoaded', function() {
    const elDataHoje = document.getElementById('dataHoje');
    const elResultadoContador = document.getElementById('resultadoContador');
    const elDataFerias = document.getElementById('dataFerias');

    async function carregarContagem() {
        try {
            const response = await fetch('/api/contagem');

            if (!response.ok) {
                throw new Error(`Erro HTTP: ${response.status}`);
            }
            const data = await response.json(); // converte a JSON

            // atualiza a página com os dados
            elDataHoje.textContent = data.dataHojeFormatada;
            elDataFerias.textContent = data.dataFeriasFormatada;

            let mensagemContador = '';
            if (data.diasRestantes > 1) {
                mensagemContador = `Faltam <strong>${data.diasRestantes}</strong> dias de aula!`;
            } else if (data.diasRestantes === 1) {
                mensagemContador = `Falta só <strong>1</strong> dia cuida papai!`;
            } else {
                mensagemContador = `<span class="mensagem-especial">Fériaaaas!!! 😎</span>`;
            }
            elResultadoContador.innerHTML = `<p>${mensagemContador}</p>`;

        } catch (error) {
            console.error('Erro ao buscar contagem:', error);
            elResultadoContador.innerHTML = '<p style="color: red;">Não foi possível carregar a contagem.</p>';
        }
    }

    // botao pra atualizar pagina caso a data mude
    const botao = document.getElementById('botaoRecarregar');
    if (botao) {
        botao.addEventListener('click', function(){
            window.location.reload();
        })
    } else { // caso botao nao seja encontrado
        console.error('Elemento com ID "botaoRecarregar" não foi encontrado.');
    }

    carregarContagem(); // chama a funçao ao recarregar a pagina
});