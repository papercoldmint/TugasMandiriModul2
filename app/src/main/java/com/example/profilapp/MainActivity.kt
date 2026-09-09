package com.example.profilapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HalamanProfilMenarik()
        }
    }
}

@Composable
fun HalamanProfilMenarik() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFF1976D2)), // Warna Biru
            contentAlignment = Alignment.BottomCenter
        ) {

            Image(
                painter = painterResource(id = R.drawable.foto_profil),
                contentDescription = "Foto Profil Gangsar",
                modifier = Modifier
                    .size(140.dp)
                    .offset(y = 70.dp)
                    .clip(CircleShape)
                    .border(4.dp, Color.White, CircleShape),
                contentScale = ContentScale.Crop, // Memotong foto
                alignment = Alignment.TopCenter   // TAMBAHKAN BARIS INI: Fokuskan potongan ke atas
            )
        }


        Spacer(modifier = Modifier.height(85.dp))


        Text(
            text = "Gangsar Wijaya",
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(4.dp))


        Text(
            text = "An undergraduate student Information System",
            fontSize = 16.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 32.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .background(Color.White, shape = RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            RowKontak(ikon = Icons.Filled.Email, teks = "gangsarwijaya@student.ub.ac.id")
            Spacer(modifier = Modifier.height(16.dp))
            RowKontak(ikon = Icons.Filled.Phone, teks = "+62 812 3456 7890") // Bisa kamu ganti nomormu
        }
    }
}

@Composable
fun RowKontak(ikon: androidx.compose.ui.graphics.vector.ImageVector, teks: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color(0xFFE3F2FD), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = ikon,
                contentDescription = null,
                tint = Color(0xFF1976D2),
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = teks, fontSize = 15.sp, color = Color.Black)
    }
}

