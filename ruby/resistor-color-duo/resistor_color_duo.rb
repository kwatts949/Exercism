class ResistorColorDuo

  def self.value(str)
    colours = ["black","brown","red","orange","yellow","green","blue","violet","grey","white"]
  
    p str
    number = []
    number.push(colours.find_index(str[0]))
    number.push(colours.find_index(str[1]))
    p number.join().to_i
  end
end