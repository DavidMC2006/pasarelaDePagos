-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 16-08-2025 a las 22:02:31
-- Versión del servidor: 11.5.2-MariaDB
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
-- Estructura de tabla para la tabla `metodos_de_pago`
--

DROP TABLE IF EXISTS `metodos_de_pago`;
CREATE TABLE IF NOT EXISTS `metodos_de_pago` (
  `id_metodo` int(20) NOT NULL,
  `nombre_metodo_pago` varchar(50) NOT NULL,
  PRIMARY KEY (`id_metodo`),
  UNIQUE KEY `nombre_metodo_pago` (`nombre_metodo_pago`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `id_producto` int(20) NOT NULL,
  `nombre_producto` varchar(100) NOT NULL,
  `descripcion_producto` varchar(100) DEFAULT NULL,
  `precio_producto` decimal(10,2) NOT NULL,
  `stock` int(20) NOT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `cc` int(10) NOT NULL,
  `nombre_usuario` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`cc`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
