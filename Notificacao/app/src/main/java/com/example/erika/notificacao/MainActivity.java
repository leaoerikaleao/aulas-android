package com.example.erika.notificacao;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    PendingIntent resultPendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btNoficicar =  (Button) findViewById(R.id.btNotificar);
        Button btAtualizar =  (Button) findViewById(R.id.btAtualizar);

        findViewById(R.id.btNotificar).setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                notificar();
            }
        });

        findViewById(R.id.btAtualizar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                atualizarNotificacao();
            }
        });

    }

    protected void notificar() {
        int idNotificacao = 12345;
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setSmallIcon(android.R.drawable.ic_menu_info_details);
        mBuilder.setContentTitle("Notificação PDM");
        mBuilder.setContentText("Hora de Estudar!");
        Intent resultIntent = new Intent(this, ExecutaNotificacaoActivity.class);
        resultPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, resultIntent, 0);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(idNotificacao, mBuilder.build());
    }

    protected void atualizarNotificacao() {
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        int idNotificacao = 12345;
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setSmallIcon(android.R.drawable.ic_menu_today);
        mBuilder.setContentTitle("Atualização Notificação PDM");
        mBuilder.setContentText("Estudar para a prov At!");
        mBuilder.setContentIntent(resultPendingIntent);
        mNotificationManager.notify(idNotificacao,mBuilder.build());
    }

}