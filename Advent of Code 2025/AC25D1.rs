use std::fs::File;
use std::io::{self, BufRead, BufReader};


fn main() -> Result<(), Box<dyn std::error::Error>>{
    let file = File::open("R27.txt")?;
    let reader = BufReader::new(file);
    let mut total = 0;

    for line in reader.lines() {
        let line = line?; // Handle potential errors for each line
        line
        println!("{}", line);
    }
    Ok(())
    
}