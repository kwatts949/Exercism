class Isogram
  def self.isogram?(input)
    letters_array = input.delete('-').delete(" ").downcase.split("")
    p letters_array
    letters_array.uniq == letters_array
  end
end