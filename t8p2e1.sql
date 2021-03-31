-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 31-03-2021 a las 09:33:55
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `t8p2e1`
--
CREATE DATABASE IF NOT EXISTS `t8p2e1` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `t8p2e1`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogados`
--

CREATE TABLE IF NOT EXISTS `abogados` (
  `Dni` varchar(9) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  PRIMARY KEY (`Dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abogados`
--

INSERT INTO `abogados` (`Dni`, `Nombre`, `Apellidos`, `Direccion`) VALUES
('11', 'Juan', 'Pelo', 'Avenida-Gasteiz 22'),
('aaaa', 'Jose', 'Jose', 'Jose');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogados-casos`
--

CREATE TABLE IF NOT EXISTS `abogados-casos` (
  `DniAbogados` varchar(9) NOT NULL,
  `IDCasos` varchar(50) NOT NULL,
  PRIMARY KEY (`DniAbogados`,`IDCasos`),
  KEY `DniAbogados` (`DniAbogados`),
  KEY `IDCasos` (`IDCasos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casos`
--

CREATE TABLE IF NOT EXISTS `casos` (
  `NroExp` varchar(50) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFinalizacion` date DEFAULT NULL,
  `Estado` varchar(50) NOT NULL,
  `DniCliente` varchar(9) NOT NULL,
  PRIMARY KEY (`NroExp`),
  KEY `DniCliente` (`DniCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `Dni` varchar(9) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(9) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  PRIMARY KEY (`Dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Dni`, `Nombre`, `Apellidos`, `Direccion`, `Telefono`, `Correo`) VALUES
('1', 'Alenajdro', 'Gamer', 'x', 'q', 'q'),
('58011619F', 'Oier', 'Velar Lopez de Heredia', 'Domingo Beltran 40', '674503042', 'oierajo@gmail.com');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abogados-casos`
--
ALTER TABLE `abogados-casos`
  ADD CONSTRAINT `abogados-casos_ibfk_1` FOREIGN KEY (`IDCasos`) REFERENCES `casos` (`NroExp`),
  ADD CONSTRAINT `abogados-casos_ibfk_2` FOREIGN KEY (`DniAbogados`) REFERENCES `abogados` (`Dni`);

--
-- Filtros para la tabla `casos`
--
ALTER TABLE `casos`
  ADD CONSTRAINT `casos_ibfk_1` FOREIGN KEY (`DniCliente`) REFERENCES `clientes` (`Dni`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
