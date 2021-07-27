import random
name = ""
n_random_number=random.randint(1,5)
if n_random_number == 1:
  name=("Dad")
elif n_random_number == 2:
  name=("Mom")
elif n_random_number == 3:
  name=("Shye")
elif n_random_number == 4:
  name=("Ty")
elif n_random_number == 5:
  name=("Malakai")
question = ""
q_random_number=random.randint(1,9)
if q_random_number == 1:
  question=("Do you know what you are doing?")
if q_random_number == 2:
  question=("Am I doing to be rich?")
elif q_random_number == 3:
  question=("What is life?.")
elif q_random_number == 4:
  question=("Should I get up?")
elif q_random_number == 5:
  question=("To drink or not to drink?")
elif q_random_number == 6:
  question=("Should I eat?")
elif q_random_number == 7:
  question=("Why?!")
elif q_random_number == 8:
  question=("Are Laffy Taffy jokes funny?")
elif q_random_number == 9:
  question=("Will I win the lottery?")
answer =""
a_random_number=random.randint(1, 10)
#print(random_number)
if a_random_number == 1:
  answer=("Yes - definitely.")
if a_random_number == 2:
  answer=("It is decidedly so.")
elif a_random_number == 3:
  answer=("Without a doubt.")
elif a_random_number == 4:
  answer=("Reply hazy, try again.")
elif a_random_number == 5:
  answer=("Ask again later.")
elif a_random_number == 6:
  answer=("Better not tell you now.")
elif a_random_number == 7:
  answer=("My sources say no.")
elif a_random_number == 8:
  answer=("Outlook not so good.")
elif a_random_number == 9:
  answer=("Very doubtful.")
elif a_random_number == 10:
  answer=("...")
print(name + " asks: " + question)
print("Magic 8-Ball's answer: " + answer)