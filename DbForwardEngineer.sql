-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema LibraryManagementSystem
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema LibraryManagementSystem
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `LibraryManagementSystem` DEFAULT CHARACTER SET utf8 ;
USE `LibraryManagementSystem` ;

-- -----------------------------------------------------
-- Table `LibraryManagementSystem`.`Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LibraryManagementSystem`.`Book` (
  `idBook` INT NOT NULL AUTO_INCREMENT,
  `Title` VARCHAR(45) NOT NULL,
  `Author` VARCHAR(45) NOT NULL,
  `Pags` INT NULL,
  `Available` INT NULL,
  `Rented` INT NULL,
  `Img` BLOB NULL DEFAULT NULL,
  PRIMARY KEY (`idBook`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LibraryManagementSystem`.`Genre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LibraryManagementSystem`.`Genre` (
  `idGenre` INT NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGenre`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LibraryManagementSystem`.`Books_to_Genres`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LibraryManagementSystem`.`Books_to_Genres` (
  `Book_idBook` INT NOT NULL,
  `Genre_idGenre` INT NOT NULL,
  PRIMARY KEY (`Book_idBook`, `Genre_idGenre`),
  INDEX `fk_Books_to_Genres_Genre1_idx` (`Genre_idGenre` ASC) VISIBLE,
  CONSTRAINT `fk_Book_to_Genres_Book`
    FOREIGN KEY (`Book_idBook`)
    REFERENCES `mydb`.`Book` (`idBook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Books_to_Genres_Genre1`
    FOREIGN KEY (`Genre_idGenre`)
    REFERENCES `mydb`.`Genre` (`idGenre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LibraryManagementSystem`.`Member`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LibraryManagementSystem`.`Member` (
  `idMember` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Surname` VARCHAR(45) NOT NULL,
  `File` VARCHAR(45) NULL,
  `Dni` INT NULL,
  `Address` VARCHAR(45) NULL,
  `Telephone1` VARCHAR(45) NULL,
  `Telephone2` VARCHAR(45) NULL,
  `Age` INT NULL,
  `Membercol` VARCHAR(45) NULL,
  PRIMARY KEY (`idMember`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LibraryManagementSystem`.`Books_to_Members`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LibraryManagementSystem`.`Books_to_Members` (
  `Book_idBook` INT NOT NULL,
  `Member_idMember` INT NOT NULL,
  PRIMARY KEY (`Book_idBook`, `Member_idMember`),
  INDEX `fk_Books_to_Members_Member1_idx` (`Member_idMember` ASC) VISIBLE,
  CONSTRAINT `fk_Books_to_Members_Book1`
    FOREIGN KEY (`Book_idBook`)
    REFERENCES `mydb`.`Book` (`idBook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Books_to_Members_Member1`
    FOREIGN KEY (`Member_idMember`)
    REFERENCES `mydb`.`Member` (`idMember`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
