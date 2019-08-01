package com.christian.zanthus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by 21220 on 05/09/17.
 */

public class Funcoes_PDV extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funcoes_install);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        ListView listview = (ListView) findViewById(R.id.lvfuncoes);
        String[] dados = new String[]{"Funçes para ativar o PDV SAT",
                "6060 → Ativa licença ECF",
                "6066 → Verifica licença ECF ",
                "12950 → Altera o tipo do Leitor biométrico = 1",
                "12901 → Ativa o leitor biometrico",
                "6450 → Configura Scanner Torre 1 - Porta 6",
                "6401 → Ativa Scanners ",
                "6451 → Configura Scanner Torre 2 - RTS 4",
                "6401 → Ativa Scanners ",
                "6455 → Configura Scanner Mão - Porta 14 ",
                "6401 → Ativa Scanners",
                "7250 → Configura Pinpad - Tipo 21 Porta 2",
                "7201 → Ativa Pinpad ",
                "3401 → Ativa WebService ",
                "3501 → Ativa NF ",
                "3801 → Ativa Sitef no PDV ",
                "851 → Carga Completa ",
                "3810 → Testa comunicação com o Pinpad ",
                "3877 → Testa comunicação como Servidor Tef ",
                "685 → Configura terminal rede tef VOX ",
                "686 → Ativa terminal rede tef VOX ",
                "6301 → ativar fidelidade no pdv; ",
                "58 → Ativar perfil do PDV, 9 para SAT Loja, 95 para SAT lanch, 0 para ECF ",
                "12475 → Função para verificar Rotas SAT e SATs ativos ",
                "6201 → Função para ativar o QRCODE na impressora ",
                "6277 → Testar impressão QRCODE (escolher 1 na pŕoxima tela) ",
                "12501 → Função para Ativar Transmissão Fiscal ",
                "12451 → Função para Ativar LOG = log SAT 127 ",
                "12977 → Teste de biometria",
                "6702 → Desabilita balança checkout",
                "12310 → Recupera COO",
                "",
                "### FUNÇÕES SELF CHECKOUT ###",
                "14250 → Altera tipo balança = 2",
                "14251 → Configuração balança de conferência",
                "14201 → Ativa balança de conferência",
                "14277 → Testa balança de conferência",
                "3405 → Ativa Carga REST",
                "854 → Carga REST",
                "14101 → Ativa modo Self-checkout",
                "14103 → Entra em modo Cliente Operando",
                "8251 → Modo Log =0",
                "",
                "***** OUTRAS FUNÇÕES *****",
                "12910 → Cadastra Biometria",
                "9467 → Verifica Path_comum ",
                "6701 → Habilita balança checkout (Baurupar) ",
                "6750 → Configura balança checkout (Baurupar) ",
                "*Balança TOLEDO  *BALANCA=0  *PORTA=3  *ou   *Balanca FILIZOLA  *BALANCA=4  *PORTA=3 ",
                "6777 → Testa balança checkout (; ou X - pega peso) ",
                "8238 → Gera arquivo MFD com o periodo solicitado ",
                "8242 → Extrai CAT52 ",
                "9034 → Troca senha ",
                "9998 → Abre gaveta ",
                "151 → Abertura de caixa ",
                "155 → Saida operador ",
                "159 → Fechamento de caixa ",
                "179 → Recupera movimento de uma data ",
                "853 → Carga Parcial ",
                "859 → Carrega arquivos .CFG para configuração ",
                "201 → Emite Leitura X"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, dados);
        listview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listview.setAdapter(adapter);
    }
}
