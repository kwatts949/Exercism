class Isogram
  def self.isogram?(input)
    letters_array = input.delete('-').delete(" ").downcase.split("")
    
    letters_array.uniq == letters_array
  end
end