-- MySQL Script generated by MySQL Workbench
-- Mon Oct  2 06:05:59 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema foro-alura
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema foro-alura
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `foro-alura` DEFAULT CHARACTER SET utf8 ;
USE `foro-alura` ;

-- -----------------------------------------------------
-- Table `foro-alura`.`Topicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `foro-alura`.`Topicos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL UNIQUE,
  `mensaje` VARCHAR(100) NULL UNIQUE,
  `fecha_creacion` DATE NULL,
  `estatus` VARCHAR(45) NULL,
  `autor` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

select * from topicos;