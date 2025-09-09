-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 09-09-2025 a las 21:47:29
-- Versión del servidor: 9.1.0
-- Versión de PHP: 8.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pasarela_de_pagos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

DROP TABLE IF EXISTS `pagos`;
CREATE TABLE IF NOT EXISTS `pagos` (
  `id_pago` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_producto` int NOT NULL,
  `monto` decimal(10,2) NOT NULL,
  `fecha_pago` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `metodo_pago` varchar(50) NOT NULL,
  `estado` enum('pendiente','aprobado','rechazado') DEFAULT 'pendiente',
  PRIMARY KEY (`id_pago`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_producto` (`id_producto`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `pagos`
--

INSERT INTO `pagos` (`id_pago`, `id_usuario`, `id_producto`, `monto`, `fecha_pago`, `metodo_pago`, `estado`) VALUES
(1, 1, 2, 250000.00, '2025-08-26 18:50:33', 'tarjeta_credito', 'aprobado'),
(2, 2, 1, 120000.00, '2025-08-26 18:50:40', 'efectivo', 'pendiente'),
(3, 2, 1, 120000.00, '2025-08-26 18:55:47', 'efectivo', 'aprobado'),
(4, 1, 2, 250000.00, '2025-08-26 18:55:54', 'efectivo', 'aprobado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_apple_pay`
--

DROP TABLE IF EXISTS `pago_apple_pay`;
CREATE TABLE IF NOT EXISTS `pago_apple_pay` (
  `id_apple_pay` int NOT NULL AUTO_INCREMENT,
  `apple_id` varchar(100) DEFAULT NULL,
  `token_transaccion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_apple_pay`),
  UNIQUE KEY `apple_id` (`apple_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_bitcoin`
--

DROP TABLE IF EXISTS `pago_bitcoin`;
CREATE TABLE IF NOT EXISTS `pago_bitcoin` (
  `id_bitcoin` int NOT NULL AUTO_INCREMENT,
  `walleAdress` varchar(50) NOT NULL,
  PRIMARY KEY (`id_bitcoin`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_consignacion`
--

DROP TABLE IF EXISTS `pago_consignacion`;
CREATE TABLE IF NOT EXISTS `pago_consignacion` (
  `id_consignacion` int NOT NULL AUTO_INCREMENT,
  `numero_cuenta` varchar(50) NOT NULL,
  `banco` varchar(50) NOT NULL,
  `referencia` varchar(50) NOT NULL,
  PRIMARY KEY (`id_consignacion`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_efectivo`
--

DROP TABLE IF EXISTS `pago_efectivo`;
CREATE TABLE IF NOT EXISTS `pago_efectivo` (
  `id_efectivo` int NOT NULL AUTO_INCREMENT,
  `monto_recibido` double NOT NULL,
  `cambio` double NOT NULL,
  `correo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_efectivo`),
  UNIQUE KEY `correo` (`correo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_google_pay`
--

DROP TABLE IF EXISTS `pago_google_pay`;
CREATE TABLE IF NOT EXISTS `pago_google_pay` (
  `id_pago` int NOT NULL,
  `token_pago` varchar(200) NOT NULL,
  `dispositivo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_pago`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_paypal`
--

DROP TABLE IF EXISTS `pago_paypal`;
CREATE TABLE IF NOT EXISTS `pago_paypal` (
  `id_paypal` int NOT NULL AUTO_INCREMENT,
  `email_paypal` varchar(50) DEFAULT NULL,
  `clave` varchar(50) NOT NULL,
  PRIMARY KEY (`id_paypal`),
  UNIQUE KEY `email_paypal` (`email_paypal`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_tarjeta_credito`
--

DROP TABLE IF EXISTS `pago_tarjeta_credito`;
CREATE TABLE IF NOT EXISTS `pago_tarjeta_credito` (
  `id_credito` int NOT NULL AUTO_INCREMENT,
  `numero_tarjeta` varchar(50) DEFAULT NULL,
  `titular` varchar(50) NOT NULL,
  `banco` varchar(50) NOT NULL,
  `fecha_expedicion` date NOT NULL,
  `cvv` varchar(50) NOT NULL,
  PRIMARY KEY (`id_credito`),
  UNIQUE KEY `numero_tarjeta` (`numero_tarjeta`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_tarjeta_debito`
--

DROP TABLE IF EXISTS `pago_tarjeta_debito`;
CREATE TABLE IF NOT EXISTS `pago_tarjeta_debito` (
  `id_debito` int NOT NULL AUTO_INCREMENT,
  `numero_tarjeta` varchar(50) DEFAULT NULL,
  `titular` varchar(50) NOT NULL,
  `banco` varchar(50) NOT NULL,
  `fecha_expedicion` date NOT NULL,
  `cvv` varchar(50) NOT NULL,
  PRIMARY KEY (`id_debito`),
  UNIQUE KEY `numero_tarjeta` (`numero_tarjeta`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_transferencia`
--

DROP TABLE IF EXISTS `pago_transferencia`;
CREATE TABLE IF NOT EXISTS `pago_transferencia` (
  `id_transferencia` int NOT NULL AUTO_INCREMENT,
  `id_pago` int NOT NULL,
  `banco` varchar(50) NOT NULL,
  `referencia` varchar(100) NOT NULL,
  PRIMARY KEY (`id_transferencia`),
  KEY `id_pago` (`id_pago`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text,
  `precio` decimal(10,2) NOT NULL,
  `stock` int DEFAULT '0',
  PRIMARY KEY (`id_producto`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombre`, `descripcion`, `precio`, `stock`) VALUES
(1, 'Audífonos Bluetooth', 'Audífonos inalámbricos con cancelación de ruido', 120000.00, 15),
(2, 'Smartwatch', 'Reloj inteligente resistente al agua', 250000.00, 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `cc` bigint NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `fecha_registro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cc`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
