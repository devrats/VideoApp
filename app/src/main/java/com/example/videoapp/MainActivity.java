package com.example.videoapp;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Runnable runnable;
    Handler handler = new Handler();
    SeekBar seekBar;
    SeekBar seekBar2;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
//        mediaPlayer = MediaPlayer.create(this, R.raw.one);
//        mediaPlayer2 = MediaPlayer.create(this, R.raw.two);
//        mediaPlayer.start();
//        mediaPlayer2.start();
//        mediaPlayer.pause();
//        mediaPlayer2.pause();
//        seekBar.setMax(mediaPlayer.getDuration());
//        seekBar2.setMax(mediaPlayer2.getDuration());
        //        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if (fromUser) {
//                    mediaPlayer.seekTo(progress);
//                    seekBar.setProgress(progress);
//                }
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if(fromUser) {
//                    mediaPlayer2.seekTo(progress);
//                    seekBar.setProgress(progress);
//                }
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
        mediaPlayer = new MediaPlayer();
        mediaPlayer2 = new MediaPlayer();
        SurfaceView surfaceView = findViewById(R.id.surfaceView);
        SurfaceView surfaceView2 = findViewById(R.id.surfaceView2);
        SurfaceHolder surfaceHolder = surfaceView.getHolder();
        SurfaceHolder surfaceHolder2 = surfaceView2.getHolder();
        surfaceView.setKeepScreenOn(true);
        surfaceView2.setKeepScreenOn(true);
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
        surfaceHolder2.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer2.setDisplay(surfaceHolder2);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
        try {
            mediaPlayer.setDataSource("https://r5---sn-npoe7nes.googlevideo.com/videoplayback?expire=1628788694&ei=dgMVYeayN6nWxN8PqK28sAM&ip=201.182.67.52&id=o-AK5PfTi02hrqUz9vKej6H1f-jn29uZYRFk6w3qiRx_yK&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=19-beP5Zwe41wl2RVoS2KY8G&gir=yes&clen=21231667&ratebypass=yes&dur=452.394&lmt=1537517596581574&fexp=24001373,24007246&c=WEB&n=b9ecZqVF3Wkolr1VeQk9&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgIT6POIcvvZh2sFBnhQ58vxZbrwZpUENViC0QuW0L7ewCIQCtVCNBO0HcHL2RMpKxnSwPlbq78yhlUblP97aZzgmlgQ%3D%3D&rm=sn-xhcg5uxa-4vge76&req_id=31e8d22a133ea3ee&redirect_counter=2&cm2rm=sn-bg0ke76&cms_redirect=yes&mh=Pe&mip=1.23.190.130&mm=34&mn=sn-npoe7nes&ms=ltu&mt=1628766879&mv=u&mvi=5&pl=24&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgfGe5-Tym1egC-fPkSFYAeZXo1kE1nUBOdf5nITVmEnsCIQCd8nFte4biYU_QA55VTD_S3gYYV_84BTkLC1rq4QOz2Q%3D%3D");
            mediaPlayer2.setDataSource("https://r3---sn-bg0ezn7z.googlevideo.com/videoplayback?expire=1628781980&ei=POkUYfCxD5zD0wXlqpDwDg&ip=186.251.250.10&id=o-ACWAjm_aWMq_HNhfDGM3VzQ2rL8JmQ2XRP6UQ9o4CmAB&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=eaDVczhITkpEcmc9r5neALIG&gir=yes&clen=9547677&ratebypass=yes&dur=297.099&lmt=1627707908266360&fexp=24001373,24007246&c=WEB&txp=5430434&n=e2b8PNkZ6IbN7PTZWtk&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAMk_rKv4bpTRgNWC2CwrYJzVaT5qO3pJm82mUBYMS3mbAiEAzGdzQYnixSBdN84UL1wQU0QwUMN86pNDiNfw7XY2Nmg%3D&rm=sn-nx5oxuuxaxcg-24ce7l,sn-pmcg-bg0e7y&req_id=1d399f57d323a3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mh=qT&mm=30&mn=sn-bg0ezn7z&ms=nxu&mt=1628777066&mv=m&mvi=3&pl=24&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgInXgIDheftuHAE0hbS0d_HgB70RlQiPlcsJpYE8nF2UCIBr9StdWK371bil1Pz3EaluK6nJZy2lDa5RcmXMBJaPP");
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setOnPreparedListener(mp -> {
            Toast.makeText(MainActivity.this, "Your 1st content is prepared", Toast.LENGTH_SHORT).show();
            mp.start();
            mp.pause();
            seekBar.setMax(mediaPlayer.getDuration());
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer.seekTo(progress);
                        seekBar.setProgress(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        });
        mediaPlayer2.setOnPreparedListener(mp -> {
            Toast.makeText(MainActivity.this, "Your 2nd content is prepared", Toast.LENGTH_SHORT).show();
            mp.start();
            mp.pause();
            seekBar2.setMax(mediaPlayer2.getDuration());
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer2.seekTo(progress);
                        seekBar.setProgress(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        });
        mediaPlayer.prepareAsync();
        mediaPlayer2.prepareAsync();
        mediaPlayer.start();
        mediaPlayer2.start();
        mediaPlayer.pause();
        mediaPlayer2.pause();
        button.setOnClickListener(v -> {
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
                mediaPlayer2.pause();
                button.setText("Pause");
                button2.setText("Play");
                updateSeekbar();
            } else {
                mediaPlayer.pause();
                button.setText("Play");
            }
        });
        button2.setOnClickListener(v -> {
            if (!mediaPlayer2.isPlaying()) {
                mediaPlayer2.start();
                mediaPlayer.pause();
                button2.setText("Pause");
                button.setText("Play");
                updateSeekbar2();
            } else {
                mediaPlayer2.pause();
                button2.setText("Play");
            }
        });

    }


    private void updateSeekbar2() {
        int currentPosition = mediaPlayer2.getCurrentPosition();
        seekBar2.setProgress(currentPosition);
        runnable = this::updateSeekbar2;
        handler.postDelayed(runnable, 1000);
    }

    private void updateSeekbar() {
        int currentPosition = mediaPlayer.getCurrentPosition();
        seekBar.setProgress(currentPosition);
        runnable = this::updateSeekbar;
        handler.postDelayed(runnable, 1000);
    }
}