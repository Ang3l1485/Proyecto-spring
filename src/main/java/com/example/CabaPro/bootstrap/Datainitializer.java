package com.example.CabaPro.bootstrap;

import com.example.CabaPro.Services.AdministradorService;
import com.example.CabaPro.Services.ArbitroService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Datainitializer implements CommandLineRunner {

    private final AdministradorService administradorService;
    private final ArbitroService arbitroService;

    public Datainitializer(AdministradorService administradorService,
                           ArbitroService arbitroService) {
        this.administradorService = administradorService;
        this.arbitroService = arbitroService;
    }

    @Override
    @Transactional
    public void run(String... args) {
        // ADMINISTRADORES: username, email, nombre, apellido, rawPassword, tipo
        administradorService.createAdminIfNotExists("super", "super@caba.com", "Super", "Admin", "superpassword", "SUPER_ADMIN", "/ImagenesPerfil/SuperAdmin1.jpg");
        administradorService.createAdminIfNotExists("restrepoadmin", "restrepoadmin@caba.com", "Juan", "Restrepo", "adminpassword", "ADMIN", "/ImagenesPerfil/Admin1.jpg");

        // ARBITRO: username, email, nombre, apellido, rawPassword, especialidad, escalafon, disponibilidad
        arbitroService.createArbitroIfNotExists("Camiloref", "Camiloref@caba.com", "Camilo", "Perez",
                "refpassword", "Municipal", true,"https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-1.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro2", "LuisaRef@caba.com", "Luisa", "Fernandez",
                "abc123", "Internacional", true,"https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-10.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro3", "CarlosRef@caba.com", "Carlos", "Gomez",
                "def456", "Nacional", true,"https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-5.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro4", "MariaRef@caba.com", "María", "López",
        "ghi789", "Municipal", true, "https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-4.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro5", "JorgeRef@caba.com", "Jorge", "Ramírez",
                "jkl012", "Internacional", true, "https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-3.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro6", "AndreaRef@caba.com", "Andrea", "Hernández",
                "mno345", "Nacional", true, "https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-2.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro7", "PedroRef@caba.com", "Pedro", "Martínez",
                "pqr678", "Municipal", true, "https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-6.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro8", "SofiaRef@caba.com", "Sofía", "Rodríguez",
                "stu901", "Internacional", true, "https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-7.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro9", "DanielRef@caba.com", "Daniel", "Torres",
                "vwx234", "Nacional", true, "https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-8.jpeg");
        arbitroService.createArbitroIfNotExists("arbitro10", "LauraRef@caba.com", "Laura", "Castro",
                "yz0123", "Municipal", true, "https://fotos-arbitros.s3.us-east-1.amazonaws.com/arbitro-9.jpeg");

    }
}
